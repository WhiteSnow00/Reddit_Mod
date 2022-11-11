// 
// Decompiled by Procyon v0.6.0
// 

package lk2;

import java.util.concurrent.Executors;
import java.io.FileOutputStream;
import java.util.concurrent.ExecutorService;
import java.io.File;

public abstract class a implements f
{
    public final d a;
    public final File b;
    public final ExecutorService c;
    public FileOutputStream d;
    public final a$a e;
    
    public a(final d$b a, final File b) {
        this.c = Executors.newSingleThreadExecutor();
        this.e = new a$a(this);
        this.a = (d)a;
        this.b = b;
    }
}
