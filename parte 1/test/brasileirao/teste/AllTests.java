package brasileirao.teste;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ CampeonatoTest.class, PartidaTest.class, TabelaTest.class, TimeTest.class })
public class AllTests {

}
