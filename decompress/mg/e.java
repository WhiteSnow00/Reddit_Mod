// 
// Decompiled by Procyon v0.6.0
// 

package mg;

import java.util.concurrent.ThreadFactory;

public final class e implements ThreadFactory
{
    @Override
    public final Thread newThread(final Runnable runnable) {
        return new Thread(runnable, "SplitCompatBackgroundThread");
    }
}
