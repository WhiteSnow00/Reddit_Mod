// 
// Decompiled by Procyon v0.6.0
// 

package i4;

import b4.c;
import java.util.Comparator;
import android.graphics.Rect;

public final class b
{
    public static boolean a(int n, final Rect rect, final Rect rect2, final Rect rect3) {
        final boolean b = b(n, rect, rect2);
        final boolean b2 = b(n, rect, rect3);
        boolean b3 = false;
        if (b2 || !b) {
            return false;
        }
        boolean b4 = false;
        Label_0129: {
            Label_0126: {
                if (n != 17) {
                    if (n != 33) {
                        if (n != 66) {
                            if (n != 130) {
                                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            }
                            if (rect.bottom > rect3.top) {
                                break Label_0126;
                            }
                        }
                        else if (rect.right > rect3.left) {
                            break Label_0126;
                        }
                    }
                    else if (rect.top < rect3.bottom) {
                        break Label_0126;
                    }
                }
                else if (rect.left < rect3.right) {
                    break Label_0126;
                }
                b4 = true;
                break Label_0129;
            }
            b4 = false;
        }
        if (!b4) {
            return true;
        }
        if (n != 17 && n != 66) {
            final int d = d(n, rect, rect2);
            int n2;
            if (n != 17) {
                if (n != 33) {
                    if (n != 66) {
                        if (n != 130) {
                            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        }
                        n = rect3.bottom;
                        n2 = rect.bottom;
                    }
                    else {
                        n = rect3.right;
                        n2 = rect.right;
                    }
                }
                else {
                    n = rect.top;
                    n2 = rect3.top;
                }
            }
            else {
                n = rect.left;
                n2 = rect3.left;
            }
            if (d < Math.max(1, n - n2)) {
                b3 = true;
            }
            return b3;
        }
        return true;
    }
    
    public static boolean b(final int n, final Rect rect, final Rect rect2) {
        final boolean b = true;
        boolean b2 = true;
        if (n != 17) {
            if (n != 33) {
                if (n == 66) {
                    return rect2.bottom >= rect.top && rect2.top <= rect.bottom && b;
                }
                if (n != 130) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
            }
            if (rect2.right < rect.left || rect2.left > rect.right) {
                b2 = false;
            }
            return b2;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom && b;
    }
    
    public static boolean c(int n, final Rect rect, final Rect rect2) {
        final boolean b = true;
        final boolean b2 = true;
        final boolean b3 = true;
        boolean b4 = true;
        if (n == 17) {
            n = rect.right;
            final int right = rect2.right;
            return (n > right || rect.left >= right) && rect.left > rect2.left && b3;
        }
        if (n == 33) {
            n = rect.bottom;
            final int bottom = rect2.bottom;
            return (n > bottom || rect.top >= bottom) && rect.top > rect2.top && b2;
        }
        if (n == 66) {
            final int left = rect.left;
            n = rect2.left;
            return (left < n || rect.right <= n) && rect.right < rect2.right && b;
        }
        if (n == 130) {
            n = rect.top;
            final int top = rect2.top;
            if ((n >= top && rect.bottom > top) || rect.bottom >= rect2.bottom) {
                b4 = false;
            }
            return b4;
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }
    
    public static int d(int n, final Rect rect, final Rect rect2) {
        int n2;
        if (n != 17) {
            if (n != 33) {
                if (n != 66) {
                    if (n != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    n = rect2.top;
                    n2 = rect.bottom;
                }
                else {
                    n = rect2.left;
                    n2 = rect.right;
                }
            }
            else {
                n = rect.top;
                n2 = rect2.bottom;
            }
        }
        else {
            n = rect.left;
            n2 = rect2.right;
        }
        return Math.max(0, n - n2);
    }
    
    public static int e(int left, final Rect rect, final Rect rect2) {
        Label_0073: {
            if (left != 17) {
                if (left != 33) {
                    if (left == 66) {
                        break Label_0073;
                    }
                    if (left != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
                left = rect.left;
                return Math.abs(rect.width() / 2 + left - (rect2.width() / 2 + rect2.left));
            }
        }
        final int top = rect.top;
        left = rect.height() / 2;
        return Math.abs(left + top - (rect2.height() / 2 + rect2.top));
    }
    
    public interface a<T>
    {
    }
    
    public static final class b<T> implements Comparator<T>
    {
        public final Rect f;
        public final Rect g;
        public final boolean h;
        public final a<T> i;
        
        public b(final boolean h, final a$a i) {
            this.f = new Rect();
            this.g = new Rect();
            this.h = h;
            this.i = (a<T>)i;
        }
        
        @Override
        public final int compare(final T t, final T t2) {
            final Rect f = this.f;
            final Rect g = this.g;
            ((a$a)this.i).getClass();
            ((c)t).e(f);
            ((a$a)this.i).getClass();
            ((c)t2).e(g);
            final int top = f.top;
            final int top2 = g.top;
            int n = -1;
            if (top < top2) {
                return -1;
            }
            if (top > top2) {
                return 1;
            }
            final int left = f.left;
            final int left2 = g.left;
            if (left < left2) {
                if (this.h) {
                    n = 1;
                }
                return n;
            }
            if (left > left2) {
                if (!this.h) {
                    n = 1;
                }
                return n;
            }
            final int bottom = f.bottom;
            final int bottom2 = g.bottom;
            if (bottom < bottom2) {
                return -1;
            }
            if (bottom > bottom2) {
                return 1;
            }
            final int right = f.right;
            final int right2 = g.right;
            if (right < right2) {
                if (this.h) {
                    n = 1;
                }
                return n;
            }
            if (right > right2) {
                if (!this.h) {
                    n = 1;
                }
                return n;
            }
            return 0;
        }
    }
}
