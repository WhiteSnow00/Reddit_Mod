// 
// Decompiled by Procyon v0.6.0
// 

package lg2;

import kotlin.NoWhenBranchMatchedException;
import java.util.ArrayDeque;
import kotlin.collections.a;
import java.util.Iterator;
import ng2.e;
import kotlin.io.FileWalkDirection;
import java.io.File;
import wi2.k;

public final class b implements k<File>
{
    public final File a;
    public final FileWalkDirection b;
    public final int c;
    
    public b(final File a, final FileWalkDirection b) {
        e.f((Object)a, "start");
        e.f((Object)b, "direction");
        this.a = a;
        this.b = b;
        this.c = Integer.MAX_VALUE;
    }
    
    @Override
    public final Iterator<File> iterator() {
        return (Iterator<File>)new b();
    }
    
    public abstract static class a extends c
    {
        public a(final File file) {
            e.f((Object)file, "rootDir");
            super(file);
        }
    }
    
    public final class b extends kotlin.collections.a<File>
    {
        public final ArrayDeque<lg2.b.c> h;
        public final b i;
        
        public b(final b i) {
            this.i = i;
            final ArrayDeque h = new ArrayDeque();
            this.h = h;
            if (i.a.isDirectory()) {
                h.push(this.d(i.a));
            }
            else if (i.a.isFile()) {
                h.push(new b(i.a));
            }
            else {
                this.b();
            }
        }
        
        public final void a() {
            File a;
            while (true) {
                final lg2.b.c c = this.h.peek();
                if (c == null) {
                    a = null;
                    break;
                }
                a = c.a();
                if (a == null) {
                    this.h.pop();
                }
                else {
                    if (e.a((Object)a, (Object)c.a) || !a.isDirectory()) {
                        break;
                    }
                    if (this.h.size() >= this.i.c) {
                        break;
                    }
                    this.h.push(this.d(a));
                }
            }
            if (a != null) {
                this.c((Object)a);
            }
            else {
                this.b();
            }
        }
        
        public final lg2.b.a d(final File file) {
            final int n = d.a[((Enum)this.i.b).ordinal()];
            lg2.b.a a;
            if (n != 1) {
                if (n != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                a = new a(file);
            }
            else {
                a = new c(file);
            }
            return a;
        }
        
        public final class a extends lg2.b.a
        {
            public boolean b;
            public File[] c;
            public int d;
            public boolean e;
            public final b f;
            
            public a(final b f, final File file) {
                ng2.e.f((Object)file, "rootDir");
                this.f = f;
                super(file);
            }
            
            @Override
            public final File a() {
                if (!this.e && this.c == null) {
                    this.f.i.getClass();
                    if ((this.c = super.a.listFiles()) == null) {
                        this.f.i.getClass();
                        this.e = true;
                    }
                }
                final File[] c = this.c;
                if (c != null) {
                    final int d = this.d;
                    ng2.e.c((Object)c);
                    if (d < c.length) {
                        final File[] c2 = this.c;
                        ng2.e.c((Object)c2);
                        return c2[this.d++];
                    }
                }
                if (!this.b) {
                    this.b = true;
                    return super.a;
                }
                this.f.i.getClass();
                return null;
            }
        }
        
        public final class b extends lg2.b.c
        {
            public boolean b;
            
            public b(final File file) {
                e.f((Object)file, "rootFile");
                super(file);
            }
            
            @Override
            public final File a() {
                if (this.b) {
                    return null;
                }
                this.b = true;
                return super.a;
            }
        }
        
        public final class c extends a
        {
            public boolean b;
            public File[] c;
            public int d;
            public final b e;
            
            public c(final b e, final File file) {
                ng2.e.f((Object)file, "rootDir");
                this.e = e;
                super(file);
            }
            
            @Override
            public final File a() {
                if (!this.b) {
                    this.e.i.getClass();
                    this.b = true;
                    return super.a;
                }
                final File[] c = this.c;
                if (c != null) {
                    final int d = this.d;
                    ng2.e.c((Object)c);
                    if (d >= c.length) {
                        this.e.i.getClass();
                        return null;
                    }
                }
                Label_0134: {
                    if (this.c == null) {
                        if ((this.c = super.a.listFiles()) == null) {
                            this.e.i.getClass();
                        }
                        final File[] c2 = this.c;
                        if (c2 != null) {
                            ng2.e.c((Object)c2);
                            if (c2.length != 0) {
                                break Label_0134;
                            }
                        }
                        this.e.i.getClass();
                        return null;
                    }
                }
                final File[] c3 = this.c;
                ng2.e.c((Object)c3);
                return c3[this.d++];
            }
        }
        
        public final class d
        {
            public static final int[] a;
            
            static {
                final int[] a2 = new int[FileWalkDirection.values().length];
                a2[((Enum)FileWalkDirection.TOP_DOWN).ordinal()] = 1;
                a2[((Enum)FileWalkDirection.BOTTOM_UP).ordinal()] = 2;
                a = a2;
            }
        }
    }
    
    public abstract static class c
    {
        public final File a;
        
        public c(final File a) {
            e.f((Object)a, "root");
            this.a = a;
        }
        
        public abstract File a();
    }
}
