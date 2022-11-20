// 
// Decompiled by Procyon v0.6.0
// 

package he;

import com.google.android.gms.internal.firebase_auth_api.zzaee;
import com.google.android.gms.internal.firebase_auth_api.e;

public class z<MessageType extends e<MessageType, BuilderType>, BuilderType extends z<MessageType, BuilderType>> extends b<MessageType, BuilderType>
{
    public final com.google.android.gms.internal.firebase-auth-api.e f;
    public com.google.android.gms.internal.firebase-auth-api.e g;
    public boolean h;
    
    public z(final MessageType f) {
        this.f = (com.google.android.gms.internal.firebase-auth-api.e)f;
        this.g = (com.google.android.gms.internal.firebase-auth-api.e)f.h(4);
        this.h = false;
    }
    
    public final void b(final com.google.android.gms.internal.firebase-auth-api.e e) {
        if (this.h) {
            this.f();
            this.h = false;
        }
        final com.google.android.gms.internal.firebase-auth-api.e g = this.g;
        e1.c.a((Class)g.getClass()).d((Object)g, (Object)e);
    }
    
    public final MessageType c() {
        final com.google.android.gms.internal.firebase-auth-api.e e = this.e();
        if (((e)e).f()) {
            return (MessageType)e;
        }
        throw new zzaee((w0)e);
    }
    
    public final Object clone() throws CloneNotSupportedException {
        final z z = (z)((e)this.f).h(5);
        z.b(this.e());
        return z;
    }
    
    public final MessageType e() {
        if (this.h) {
            return (MessageType)this.g;
        }
        final com.google.android.gms.internal.firebase-auth-api.e g = this.g;
        e1.c.a((Class)g.getClass()).a((Object)g);
        this.h = true;
        return (MessageType)this.g;
    }
    
    public final void f() {
        final e g = (e)((e)this.g).h(4);
        e1.c.a((Class)g.getClass()).d((Object)g, (Object)this.g);
        this.g = (com.google.android.gms.internal.firebase-auth-api.e)g;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.e i() {
        return this.f;
    }
}
