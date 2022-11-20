// 
// Decompiled by Procyon v0.6.0
// 

package com.twilio.video;

public class DataTrackOptions
{
    public static final DataTrackOptions DEFAULT_DATA_TRACK_OPTIONS;
    public static final int DEFAULT_MAX_PACKET_LIFE_TIME = -1;
    public static final int DEFAULT_MAX_RETRANSMITS = -1;
    public final int maxPacketLifeTime;
    public final int maxRetransmits;
    public final String name;
    public final boolean ordered;
    
    static {
        DEFAULT_DATA_TRACK_OPTIONS = new Builder().ordered(true).maxPacketLifeTime(-1).maxRetransmits(-1).build();
    }
    
    private DataTrackOptions(final Builder builder) {
        this.ordered = Builder.d(builder);
        this.maxPacketLifeTime = Builder.a(builder);
        this.maxRetransmits = Builder.b(builder);
        this.name = Builder.c(builder);
    }
    
    public DataTrackOptions(final Builder builder, final int n) {
        this(builder);
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final DataTrackOptions dataTrackOptions = (DataTrackOptions)o;
        final String name = this.name;
        if ((name == null && dataTrackOptions.name != null) || (name != null && dataTrackOptions.name == null)) {
            return false;
        }
        if (name != null) {
            final String name2 = dataTrackOptions.name;
            if (name2 != null) {
                return name.equals(name2);
            }
        }
        if (this.ordered != dataTrackOptions.ordered) {
            return false;
        }
        if (this.maxPacketLifeTime != dataTrackOptions.maxPacketLifeTime) {
            return false;
        }
        if (this.maxRetransmits != dataTrackOptions.maxRetransmits) {
            b = false;
        }
        return b;
    }
    
    @Override
    public int hashCode() {
        final int ordered = this.ordered ? 1 : 0;
        int maxPacketLifeTime = this.maxPacketLifeTime;
        int hashCode = 0;
        if (maxPacketLifeTime == 0) {
            maxPacketLifeTime = 0;
        }
        int maxRetransmits = this.maxRetransmits;
        if (maxRetransmits == 0) {
            maxRetransmits = 0;
        }
        final String name = this.name;
        if (name != null) {
            hashCode = name.hashCode();
        }
        return (((ordered + 31) * 31 + maxPacketLifeTime) * 31 + maxRetransmits) * 31 + hashCode;
    }
    
    public static class Builder
    {
        private int maxPacketLifeTime;
        private int maxRetransmits;
        private String name;
        private boolean ordered;
        
        public Builder() {
            this.ordered = true;
            this.maxPacketLifeTime = -1;
            this.maxRetransmits = -1;
            this.name = null;
        }
        
        public static /* bridge */ int a(final Builder builder) {
            return builder.maxPacketLifeTime;
        }
        
        public static /* bridge */ int b(final Builder builder) {
            return builder.maxRetransmits;
        }
        
        public static /* bridge */ String c(final Builder builder) {
            return builder.name;
        }
        
        public static /* bridge */ boolean d(final Builder builder) {
            return builder.ordered;
        }
        
        public DataTrackOptions build() {
            final int maxPacketLifeTime = this.maxPacketLifeTime;
            final boolean b = true;
            Preconditions.checkArgument(maxPacketLifeTime >= -1);
            Preconditions.checkArgument(this.maxPacketLifeTime <= 65535);
            Preconditions.checkArgument(this.maxRetransmits >= -1);
            Preconditions.checkArgument(this.maxRetransmits <= 65535);
            boolean b2 = b;
            if (this.maxRetransmits != -1) {
                b2 = (this.maxPacketLifeTime == -1 && b);
            }
            Preconditions.checkState(b2);
            return new DataTrackOptions(this, 0);
        }
        
        public Builder maxPacketLifeTime(final int maxPacketLifeTime) {
            this.maxPacketLifeTime = maxPacketLifeTime;
            return this;
        }
        
        public Builder maxRetransmits(final int maxRetransmits) {
            this.maxRetransmits = maxRetransmits;
            return this;
        }
        
        public Builder name(final String name) {
            this.name = name;
            return this;
        }
        
        public Builder ordered(final boolean ordered) {
            this.ordered = ordered;
            return this;
        }
    }
}
