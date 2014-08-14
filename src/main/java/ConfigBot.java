import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

/**
 * Created by philswenson on 8/10/14.
 */
public class ConfigBot {
    private String configDirectory;
    private List<String> configPackages;


    public static void main(String[] args) {
        System.out.println("blah");
    }

    public ConfigBot(String configDirectory, List<String> configPackages){
        this.configDirectory = configDirectory;
        this.configPackages = configPackages;
        // packages to scan

//        for (String configPackage : configPackages) {
//
//        }

    }

    // iterate all beans, make sure they have no setters
    protected void validateConfig(){

    }



    public void init(){
        //

    }

    /**
     *
     * @param configBotName pass in the configbot name (corresponds to
     */
    public void getConfigBot(String configBotName){


    }

}
