import com.kodedu.random.spi.RandomService;

module com.kodedu.service.client {

    requires com.kodedu.random.spi;

    uses RandomService;

}