import com.kodedu.random.impl.AtomicRandomImpl;
import com.kodedu.random.impl.RandomServiceImpl;
import com.kodedu.random.spi.RandomService;

module com.kodedu.random.impl {
    requires com.kodedu.random.spi;

    provides RandomService with RandomServiceImpl, AtomicRandomImpl;

}