// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import kt.e;
import jt.a;

public final class Block
{
    public static final a<Block, Block.Block$Builder> ADAPTER;
    public final Long number;
    
    static {
        ADAPTER = (a)new Block.Block$BlockAdapter((Block$1)null);
    }
    
    private Block(final Block.Block$Builder block$Builder) {
        this.number = Block.Block$Builder.access$100(block$Builder);
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = true;
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!(o instanceof Block)) {
            return false;
        }
        final Block block = (Block)o;
        final Long number = this.number;
        final Long number2 = block.number;
        boolean b2 = b;
        if (number != number2) {
            b2 = (number != null && number.equals(number2) && b);
        }
        return b2;
    }
    
    @Override
    public int hashCode() {
        final Long number = this.number;
        int hashCode;
        if (number == null) {
            hashCode = 0;
        }
        else {
            hashCode = number.hashCode();
        }
        return (hashCode ^ 0x1000193) * -2128831035;
    }
    
    @Override
    public String toString() {
        return a.h(a.k("Block{number="), this.number, "}");
    }
    
    public void write(final e e) throws IOException {
        Block.ADAPTER.write(e, (Object)this);
    }
}
