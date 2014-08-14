/**
 * Created by philswenson on 8/13/14.
 */

public class PreprocesserUnitTest extends GroovyTestCase{


    void setUp(){
        URL url = this.getClass().getResource("/database.json");
        File json = new File(url.getFile());
        println "json ${json.absolutePath()}"

    }

}
