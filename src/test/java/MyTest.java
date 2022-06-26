import org.junit.jupiter.api.Test;

import javax.json.JsonBuilderFactory;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;

import static javax.json.Json.createBuilderFactory;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTest {

    @Test
    public void test(){
        JsonBuilderFactory jbf = createBuilderFactory(null);
        JsonObjectBuilder job = jbf.createObjectBuilder();
        JsonObject end = job.add("logradouro","Av. Central, 123").build();
        JsonObject cnt = job.add("mail","asilva@gmail.com").build();
        JsonObject obj = job.add("nome","Antonio").add("sobrenome","Silva").add("endereco",end).add("contato",cnt).build();

        assertEquals("",obj.toString());

    }

}
