import org.testng.annotations.Test;

public class Final {
    @Test(enabled = false)
    void A()
    {
        System.out.println("Hello");
    }

    @Test
    void B()
    {
        System.out.println("How are you?");
    }

    @Test(enabled = false)
    void C()
    {
        System.out.println("I'm fine");
    }

    @Test
    void D()
    {
        System.out.println("What about you");
    }

    @Test
    void E()
        {
            System.out.println("It should fail");
        }
}

