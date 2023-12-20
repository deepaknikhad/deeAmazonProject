package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	
		features = {"src\\test\\resources\\features"}, 
		
		glue = {"steps" ,"hooks"},
		
		publish = true,
		
		plugin = {"pretty"}
				
  //     ,dryRun= true

		
		)

public class Runner extends AbstractTestNGCucumberTests{

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
