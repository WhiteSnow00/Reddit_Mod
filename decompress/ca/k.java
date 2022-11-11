// 
// Decompiled by Procyon v0.6.0
// 

package ca;

import com.google.accompanist.insets.CalculatedWindowInsetsType;

public interface k
{
    public static final a a = k.a.a;
    
    b a();
    
    b b();
    
    CalculatedWindowInsetsType c();
    
    b d();
    
    public static final class a
    {
        public static final /* synthetic */ a a;
        public static final ca.b b;
        
        static {
            a = new a();
            b = new ca.b();
        }
    }
    
    public interface b extends e
    {
        public static final a b = a.a;
        
        default int a() {
            e e;
            if (this.h()) {
                e = this.g();
            }
            else {
                e = this.d();
            }
            return e.a();
        }
        
        default int b() {
            e e;
            if (this.h()) {
                e = this.g();
            }
            else {
                e = this.d();
            }
            return e.b();
        }
        
        default int c() {
            e e;
            if (this.h()) {
                e = this.g();
            }
            else {
                e = this.d();
            }
            return e.c();
        }
        
        e d();
        
        default int e() {
            e e;
            if (this.h()) {
                e = this.g();
            }
            else {
                e = this.d();
            }
            return e.e();
        }
        
        float f();
        
        e g();
        
        boolean h();
        
        boolean isVisible();
        
        public static final class a
        {
            public static final /* synthetic */ a a;
            public static final c b;
            
            static {
                a = new a();
                b = new c();
            }
        }
    }
}
