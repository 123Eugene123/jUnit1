import ru.netology.service.CashbackHackService;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();
    @org.junit.Test
    public void shouldFindRemainTestOne(){
        org.junit.Assert.assertEquals(service.remain(999), 1);
    }
    @org.junit.Test
    public void shouldFindRemainTestTwo(){
        org.junit.Assert.assertEquals(service.remain(1000), 0);
    }
    @org.junit.Test
    public void shouldFindRemainTestThree(){
        org.junit.Assert.assertEquals(service.remain(1001), 999);
    }
    @org.junit.Test
    public void shouldFindRemainTestFour(){
        org.junit.Assert.assertEquals(service.remain(0), 1000);
    }
}
