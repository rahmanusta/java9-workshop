package com.kodedu.process.api;

import java.util.Optional;

/**
 *
 * @author usta
 * Eger bir process'in id'si biliniyorsa, ona dair ProcessHandle elde edilebilir
 */
public class PidToHandle {
    
    public static void main(String[] args) {
        Optional<ProcessHandle> handle = ProcessHandle.of(7865);
    }
}
