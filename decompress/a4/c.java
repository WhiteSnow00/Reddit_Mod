// 
// Decompiled by Procyon v0.6.0
// 

package a4;

import android.view.ContentInfo;
import android.os.Bundle;
import android.net.Uri;
import android.os.Build$VERSION;
import android.content.ClipData;

public final class c
{
    public final f a;
    
    public c(final f a) {
        this.a = a;
    }
    
    @Override
    public final String toString() {
        return this.a.toString();
    }
    
    public static final class a
    {
        public final c a;
        
        public a(final ClipData clipData, final int n) {
            if (Build$VERSION.SDK_INT >= 31) {
                this.a = (c)new c$b(clipData, n);
            }
            else {
                this.a = (c)new c$d(clipData, n);
            }
        }
    }
    
    public interface c
    {
        void a(final Uri p0);
        
        a4.c build();
        
        void setExtras(final Bundle p0);
        
        void setFlags(final int p0);
    }
    
    public interface f
    {
        int f();
        
        ClipData g();
        
        int getFlags();
        
        ContentInfo h();
    }
}
