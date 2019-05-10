package pl.stormit;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class GreeterFacadeTest {

    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(GreeterFacade.class)
                .addClass(TimeService.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    @Inject
    GreeterFacade greeterFacade;

    @Test
    public void shouldReturnProperTime() {
        // given
        String name = "Ania";

        // when
        String greet = greeterFacade.greet(name);

        // then
        Assert.assertTrue(greet.startsWith("Hello: " + name + ", "));
    }
}