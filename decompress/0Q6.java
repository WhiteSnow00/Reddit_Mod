// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.concurrent.locks.ReentrantReadWriteLock;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.locks.ReadWriteLock;

public final class 0Q6
{
    public final ReadWriteLock LIZ;
    
    static {
        Covode.recordClassIndex(4248);
    }
    
    public 0Q6() {
        this.LIZ = new ReentrantReadWriteLock();
    }
    
    public final <T> T LIZ(final QgG<? extends T> qgG) {
        CTM.LIZ((Object)qgG);
        T t = null;
        try {
            this.LIZ.readLock().lock();
            qgG.invoke();
        }
        catch (final Exception ex) {
            t = null;
        }
        finally {
            this.LIZ.readLock().unlock();
        }
        this.LIZ.readLock().unlock();
        return t;
    }
    
    public final void LIZIZ(final QgG<2P9> qgG) {
        CTM.LIZ((Object)qgG);
        try {
            this.LIZ.writeLock().lock();
            qgG.invoke();
        }
        finally {
            this.LIZ.writeLock().unlock();
        }
    }
    
    public final <T> T LIZJ(final QgG<? extends T> qgG) {
        CTM.LIZ((Object)qgG);
        T t = null;
        try {
            this.LIZ.writeLock().lock();
            qgG.invoke();
        }
        catch (final Exception ex) {
            t = null;
        }
        finally {
            this.LIZ.writeLock().unlock();
        }
        this.LIZ.writeLock().unlock();
        return t;
    }
}
