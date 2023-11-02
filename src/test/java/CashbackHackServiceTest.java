import ru.netology.service.CashbackHackService;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();
    @org.testng.annotations.Test
    public void shouldFoundRemainOne (){
        org.testng.Assert.assertEquals(service.remain(999),1);
    }
    @org.testng.annotations.Test
    public void shouldFoundRemainTwo (){
        org.testng.Assert.assertEquals(service.remain(1000),0);
    }
    @org.testng.annotations.Test
    public void shouldFoundRemainThree (){
        org.testng.Assert.assertEquals(service.remain(0),1000);
    }
    @org.testng.annotations.Test
    public void shouldFoundRemainFour (){
        org.testng.Assert.assertEquals(service.remain(1001),999);
    }
}
