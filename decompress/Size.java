// 
// Decompiled by Procyon v0.6.0
// 

package com.amazonaws.ivs.player;

public class Size
{
    public final int height;
    public final int width;
    
    public Size(final int width, final int height) {
        this.width = width;
        this.height = height;
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = o instanceof Size;
        boolean b3;
        final boolean b2 = b3 = false;
        if (b) {
            final Size size = (Size)o;
            b3 = b2;
            if (this.width == size.width) {
                b3 = b2;
                if (this.height == size.height) {
                    b3 = true;
                }
            }
        }
        return b3;
    }
    
    public Size flip() {
        return new Size(this.height, this.width);
    }
    
    @Override
    public int hashCode() {
        return this.width * 31 + this.height;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.width);
        sb.append("x");
        sb.append(this.height);
        return sb.toString();
    }
}
