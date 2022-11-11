// 
// Decompiled by Procyon v0.6.0
// 

package com.amazonaws.ivs.player;

import java.util.Objects;

public abstract class Cue
{
    public final long endTime;
    public final long startTime;
    
    public Cue(final long startTime, final long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final Cue cue = (Cue)o;
            if (this.startTime != cue.startTime || this.endTime != cue.endTime) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.startTime, this.endTime);
    }
}
