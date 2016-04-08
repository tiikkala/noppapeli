import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class RepeatRule implements TestRule {
    /**
     * RepeatRule-luokan avulla voi helposti ajaa samaa testiä useita kertaa,
     * esimerkiksi testata pysyyko satunnaisia tietyn välin numeroita tuottava
     * metodi tarkoitetuissa rajoissa.
     * https://gist.github.com/fappel/8bcb2aea4b39ff9cfb6e#file-repeatrule-java
     */

    private static class RepeatStatement extends Statement {

    private final int times;
    private final Statement statement;

    private RepeatStatement( int times, Statement statement ) {
      this.times = times;
      this.statement = statement;
    }

    @Override
    public void evaluate() throws Throwable {
      for( int i = 0; i < times; i++ ) {
        statement.evaluate();
      }
    }
  }

  @Override
  public Statement apply( Statement statement, Description description ) {
    Statement result = statement;
    Repeat repeat = description.getAnnotation( Repeat.class );
    if( repeat != null ) {
      int times = repeat.times();
      result = new RepeatStatement( times, statement );
    }
    return result;
  }
}
