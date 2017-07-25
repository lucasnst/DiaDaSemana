package br.snt.bgs.configuracao;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.apache.cxf.Bus;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@EnableAutoConfiguration
@ComponentScan
//@EntityScan(basePackages = { "br.snt.bgs.entitys" })
//@EnableJpaRepositories({ "br.snt.bgs.repositys" })
@ImportResource({ "classpath:META-INF/cxf/cxf.xml", "classpath:META-INF/cfx-servlet.xml" })
/**
 * classe de configuração dos nossos micros serviços.
 * 
 * @author x190289 - Pedro Pacheco Manuel
 *
 */
@ConfigurationProperties(prefix = "spring.datasource")
public class ConfiguracaoWS extends SpringBootServletInitializer {

	@Autowired
	private ApplicationContext applicationContext;

	// declaração de atributos de acesso a dados data 24/04/2017

//	private String name;
//
//	private String url;
//
//	private String port;
//
//	private String schema;
//
//	private static String userName;
//
//	private static String passWord;
//
//	private static String clientProgramName;

	//
	public static void main(String[] template) throws IOException {
		//
		// // leitura de arquivos, onde contem a password e username: atualizado
		//
		// // 07/06/2017 - Pedro Pacheco Manuel
		//
		// String[] leituraArquivo = new String[template.length + 2];
		//
		// System.arraycopy(template, 0, leituraArquivo, 0, template.length);
		// //
		// //
		// userName = new
		// String(Files.readAllBytes(Paths.get(System.getenv("USERNAME_PATH"))));
		//
		// passWord = new
		// String(Files.readAllBytes(Paths.get(System.getenv("PASSWORD_PATH"))));
		//
		// // veridica qual ambiente esta chegando pra mim, se é dev, pre ou
		// // produção
		//
		// clientProgramName = System.getenv("PROJECT_NAME");
		//
		// leituraArquivo[leituraArquivo.length - 1] = "--username=" + userName;
		//
		// leituraArquivo[leituraArquivo.length - 2] = "--password=" + passWord;
		//
		SpringApplication.run(ConfiguracaoWS.class, template);

	}
	//
	// @Bean
	// public DataSource data() throws Exception {
	//
	// // verificando se o clienteprogramaName é de produção ou de homologação
	// // - Pedro Pacheco Manuel - data 02.06.2017
	//
	//
	//
	// if (clientProgramName.toLowerCase().endsWith("-pro")) {
	//
	// clientProgramName = "BG#" + "P" + "template";
	//
	// } else if (clientProgramName.toLowerCase().endsWith("-pre")) {
	//
	// clientProgramName = "BG#" + "K" + "template";
	//
	// } else if (clientProgramName.toLowerCase().endsWith("-dev")) {
	//
	// clientProgramName = "BG#" + "D" + "template";
	//
	// }
	//
	// Properties propriedade = new Properties();
	//
	// DriverManagerDataSource dataSource = new DriverManagerDataSource();
	//
	// dataSource.setDriverClassName(name);
	//
	// dataSource.setUrl(url);
	//
	// dataSource.setUsername(userName);
	//
	// dataSource.setPassword(passWord);
	//
	// propriedade.put("driverType", 4);
	//
	// propriedade.put("url", dataSource.getUrl());
	//
	// propriedade.put("user", dataSource.getUsername());
	//
	// propriedade.put("password", dataSource.getPassword());
	//
	// propriedade.put("clientProgramName", clientProgramName);
	//
	// dataSource.setConnectionProperties(propriedade);
	//
	// return dataSource;
	//
	// }

//	@Bean
//	public DataSource data() {
//
//		DriverManagerDataSource dat = new DriverManagerDataSource();
//		dat.setDriverClassName("com.ibm.db2.jcc.DB2Driver");
//		dat.setUrl("jdbc:db2://DBBGBIVLBR01:60000/MAINF");
//		dat.setUsername("cdcuser");
//		dat.setPassword("cdc@app2");
//
//		return dat;
//
//	}

	@Bean
	public ServletRegistrationBean servletRegistrationBean(ApplicationContext context) {
		return new ServletRegistrationBean(new CXFServlet(), "/mips-diasemana/*");

	}

	@PostConstruct
	private void init() {
		Bus bus = (Bus) this.applicationContext.getBean(Bus.DEFAULT_BUS_ID);
		bus.getInInterceptors().add(new LoggingInInterceptor());
		bus.getOutInterceptors().add(new LoggingOutInterceptor());
		bus.getInFaultInterceptors().add(new LoggingInInterceptor());
		bus.getOutFaultInterceptors().add(new LoggingOutInterceptor());
	}

	@Bean
	public EmbeddedServletContainerFactory embeddedServletContainerFactory() {

		TomcatEmbeddedServletContainerFactory factory = new TomcatEmbeddedServletContainerFactory("/ws-baixa", 8080);
		return factory;
	}

//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getPort() {
//		return port;
//	}
//
//	public void setPort(String port) {
//		this.port = port;
//	}
//
//	public String getSchema() {
//		return schema;
//	}
//
//	public void setSchema(String schema) {
//		this.schema = schema;
//	}
//
//	public String getUrl() {
//		return url;
//	}
//
//	public void setUrl(String url) {
//		this.url = url;
//	}
//
//	public static String getUserName() {
//		return userName;
//	}
//
//	public static void setUserName(String userName) {
//		ConfiguracaoWS.userName = userName;
//	}
//
//	public static String getPassWord() {
//		return passWord;
//	}
//
//	public static void setPassWord(String passWord) {
//		ConfiguracaoWS.passWord = passWord;
//	}
//
//	public static String getClientProgramName() {
//		return clientProgramName;
//	}
//
//	public static void setClientProgramName(String clientProgramName) {
//		ConfiguracaoWS.clientProgramName = clientProgramName;
//	}

}