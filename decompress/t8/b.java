// 
// Decompiled by Procyon v0.6.0
// 

package t8;

import java.util.ArrayDeque;
import java.util.concurrent.locks.ReentrantLock;
import ng.f0;
import java.util.HashMap;

public final class b
{
    public final HashMap a;
    public final b b;
    
    public b() {
        this.a = new HashMap();
        this.b = new b();
    }
    
    public final void a(final String s) {
        synchronized (this) {
            final a value = this.a.get(s);
            f0.a2(value);
            final a a = value;
            int b = a.b;
            if (b >= 1) {
                --b;
                Label_0186: {
                    if ((a.b = b) == 0) {
                        final a a2 = this.a.remove(s);
                        if (a2.equals(a)) {
                            final b b2 = this.b;
                            synchronized (b2.a) {
                                if (b2.a.size() < 10) {
                                    b2.a.offer(a2);
                                }
                                break Label_0186;
                            }
                        }
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Removed the wrong lock, expected to remove: ");
                        sb.append(a);
                        sb.append(", but actually removed: ");
                        sb.append(a2);
                        sb.append(", safeKey: ");
                        sb.append(s);
                        throw new IllegalStateException(sb.toString());
                    }
                }
                monitorexit(this);
                a.a.unlock();
                return;
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot release a lock that is not held, safeKey: ");
            sb2.append(s);
            sb2.append(", interestedThreads: ");
            sb2.append(a.b);
            throw new IllegalStateException(sb2.toString());
        }
    }
    
    public static final class a
    {
        public final ReentrantLock a;
        public int b;
        
        public a() {
            this.a = new ReentrantLock();
        }
    }
    
    public static final class b
    {
        public final ArrayDeque a;
        
        public b() {
            this.a = new ArrayDeque();
        }
    }
}
