package journal.system.journal;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("journal.system.journal.mapper")//指定接口文件所在的根包,实现所在包内的mapper的接口文件等同@Mapper或xml文件中的MapperScannerConfigurer
public class JournalApplication {

	public static void main(String[] args) {
		SpringApplication.run(JournalApplication.class, args);
	}

}
