// 
// Decompiled by Procyon v0.6.0
// 

package r8;

import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.DataSource;

public abstract class f
{
    public static final f$a a;
    public static final f$b b;
    public static final f$c c;
    public static final f$e d;
    
    static {
        a = new f() {
            @Override
            public final boolean a() {
                return true;
            }
            
            @Override
            public final boolean b() {
                return true;
            }
            
            @Override
            public final boolean c(final DataSource dataSource) {
                return dataSource == DataSource.REMOTE;
            }
            
            @Override
            public final boolean d(final boolean b, final DataSource dataSource, final EncodeStrategy encodeStrategy) {
                return dataSource != DataSource.RESOURCE_DISK_CACHE && dataSource != DataSource.MEMORY_CACHE;
            }
        };
        b = new f() {
            @Override
            public final boolean a() {
                return false;
            }
            
            @Override
            public final boolean b() {
                return false;
            }
            
            @Override
            public final boolean c(final DataSource dataSource) {
                return false;
            }
            
            @Override
            public final boolean d(final boolean b, final DataSource dataSource, final EncodeStrategy encodeStrategy) {
                return false;
            }
        };
        c = new f() {
            @Override
            public final boolean a() {
                return true;
            }
            
            @Override
            public final boolean b() {
                return false;
            }
            
            @Override
            public final boolean c(final DataSource dataSource) {
                return dataSource != DataSource.DATA_DISK_CACHE && dataSource != DataSource.MEMORY_CACHE;
            }
            
            @Override
            public final boolean d(final boolean b, final DataSource dataSource, final EncodeStrategy encodeStrategy) {
                return false;
            }
        };
        new f() {
            @Override
            public final boolean a() {
                return false;
            }
            
            @Override
            public final boolean b() {
                return true;
            }
            
            @Override
            public final boolean c(final DataSource dataSource) {
                return false;
            }
            
            @Override
            public final boolean d(final boolean b, final DataSource dataSource, final EncodeStrategy encodeStrategy) {
                return dataSource != DataSource.RESOURCE_DISK_CACHE && dataSource != DataSource.MEMORY_CACHE;
            }
        };
        d = new f() {
            @Override
            public final boolean a() {
                return true;
            }
            
            @Override
            public final boolean b() {
                return true;
            }
            
            @Override
            public final boolean c(final DataSource dataSource) {
                return dataSource == DataSource.REMOTE;
            }
            
            @Override
            public final boolean d(final boolean b, final DataSource dataSource, final EncodeStrategy encodeStrategy) {
                return ((b && dataSource == DataSource.DATA_DISK_CACHE) || dataSource == DataSource.LOCAL) && encodeStrategy == EncodeStrategy.TRANSFORMED;
            }
        };
    }
    
    public abstract boolean a();
    
    public abstract boolean b();
    
    public abstract boolean c(final DataSource p0);
    
    public abstract boolean d(final boolean p0, final DataSource p1, final EncodeStrategy p2);
}
