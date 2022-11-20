// 
// Decompiled by Procyon v0.6.0
// 

package he;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import java.security.Provider;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutorService;

public final class q6 implements w9
{
    public static ExecutorService b() {
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), Executors.defaultThreadFactory());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
    
    public final /* bridge */ Object a(final String s, final Provider provider) throws GeneralSecurityException {
        Mac mac;
        if (provider == null) {
            mac = Mac.getInstance(s);
        }
        else {
            mac = Mac.getInstance(s, provider);
        }
        return mac;
    }
}
