// 
// Decompiled by Procyon v0.6.0
// 

package ac;

import java.util.Arrays;
import java.util.Random;

public interface q
{
    int a(final int p0);
    
    int b(final int p0);
    
    int c();
    
    a d();
    
    int e();
    
    a f(final int p0);
    
    a g(final int p0);
    
    int getLength();
    
    public static final class a implements q
    {
        public final Random a;
        public final int[] b;
        public final int[] c;
        
        public a() {
            this(new Random());
        }
        
        public a(final Random random) {
            this(new int[0], random);
        }
        
        public a(final int[] b, final Random a) {
            this.b = b;
            this.a = a;
            this.c = new int[b.length];
            for (int i = 0; i < b.length; ++i) {
                this.c[b[i]] = i;
            }
        }
        
        @Override
        public final int a(int n) {
            int n2 = this.c[n];
            n = -1;
            if (--n2 >= 0) {
                n = this.b[n2];
            }
            return n;
        }
        
        @Override
        public final int b(int n) {
            n = this.c[n] + 1;
            final int[] b = this.b;
            if (n < b.length) {
                n = b[n];
            }
            else {
                n = -1;
            }
            return n;
        }
        
        @Override
        public final int c() {
            final int[] b = this.b;
            int n;
            if (b.length > 0) {
                n = b[b.length - 1];
            }
            else {
                n = -1;
            }
            return n;
        }
        
        @Override
        public final a d() {
            return new a(new Random(this.a.nextLong()));
        }
        
        @Override
        public final int e() {
            final int[] b = this.b;
            int n;
            if (b.length > 0) {
                n = b[0];
            }
            else {
                n = -1;
            }
            return n;
        }
        
        @Override
        public final a f(final int n) {
            final int n2 = n + 0;
            final int[] array = new int[this.b.length - n2];
            int n3 = 0;
            int n4 = 0;
            while (true) {
                final int[] b = this.b;
                if (n3 >= b.length) {
                    break;
                }
                final int n5 = b[n3];
                if (n5 >= 0 && n5 < n) {
                    ++n4;
                }
                else {
                    int n6;
                    if ((n6 = n5) >= 0) {
                        n6 = n5 - n2;
                    }
                    array[n3 - n4] = n6;
                }
                ++n3;
            }
            return new a(array, new Random(this.a.nextLong()));
        }
        
        @Override
        public final a g(final int n) {
            final int[] array = new int[n];
            final int[] array2 = new int[n];
            int n2 = 0;
            int n3;
            for (int i = 0; i < n; i = n3) {
                array[i] = this.a.nextInt(this.b.length + 1);
                final Random a = this.a;
                n3 = i + 1;
                final int nextInt = a.nextInt(n3);
                array2[i] = array2[nextInt];
                array2[nextInt] = i + 0;
            }
            Arrays.sort(array);
            final int[] array3 = new int[this.b.length + n];
            int n5;
            int n4 = n5 = 0;
            while (true) {
                final int[] b = this.b;
                if (n2 >= b.length + n) {
                    break;
                }
                if (n4 < n && n5 == array[n4]) {
                    array3[n2] = array2[n4];
                    ++n4;
                }
                else {
                    final int n6 = b[n5];
                    if ((array3[n2] = n6) >= 0) {
                        array3[n2] = n6 + n;
                    }
                    ++n5;
                }
                ++n2;
            }
            return new a(array3, new Random(this.a.nextLong()));
        }
        
        @Override
        public final int getLength() {
            return this.b.length;
        }
    }
}
