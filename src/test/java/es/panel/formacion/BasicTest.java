package es.panel.formacion;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.testng.annotations.Test;

@Test
public class BasicTest {

  public void sameString() {
	  assertThat("this string", is("this string"));
  }
  
  public void sameNumber() {
	  assertThat(123, is(123));
  }
  
 
  
}
