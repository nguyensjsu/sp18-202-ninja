public class ConcreteScoreUpdate implements Observer
{
        Counter c1 = new Counter();
        public void update()
        {
            c1.score = c1.score + 1;
        }
}