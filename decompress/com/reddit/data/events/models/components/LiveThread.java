// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import jt.b;
import java.io.IOException;
import kt.e;
import jt.a;

public final class LiveThread
{
    public static final a<LiveThread, Builder> ADAPTER;
    public final String id;
    public final Boolean is_announcement;
    
    static {
        ADAPTER = (a)new LiveThreadAdapter(null);
    }
    
    private LiveThread(final Builder builder) {
        this.id = Builder.access$100(builder);
        this.is_announcement = Builder.access$200(builder);
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
        if (!(o instanceof LiveThread)) {
            return false;
        }
        final LiveThread liveThread = (LiveThread)o;
        final String id = this.id;
        final String id2 = liveThread.id;
        if (id == id2 || (id != null && id.equals(id2))) {
            final Boolean is_announcement = this.is_announcement;
            final Boolean is_announcement2 = liveThread.is_announcement;
            boolean b2 = b;
            if (is_announcement == is_announcement2) {
                return b2;
            }
            if (is_announcement != null && is_announcement.equals(is_announcement2)) {
                b2 = b;
                return b2;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final String id = this.id;
        int hashCode = 0;
        int hashCode2;
        if (id == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = id.hashCode();
        }
        final Boolean is_announcement = this.is_announcement;
        if (is_announcement != null) {
            hashCode = is_announcement.hashCode();
        }
        return ((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("LiveThread{id=");
        k.append(this.id);
        k.append(", is_announcement=");
        k.append(this.is_announcement);
        k.append("}");
        return k.toString();
    }
    
    public void write(final e e) throws IOException {
        LiveThread.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<LiveThread>
    {
        private String id;
        private Boolean is_announcement;
        
        public Builder() {
        }
        
        public Builder(final LiveThread liveThread) {
            this.id = liveThread.id;
            this.is_announcement = liveThread.is_announcement;
        }
        
        public static /* synthetic */ String access$100(final Builder builder) {
            return builder.id;
        }
        
        public static /* synthetic */ Boolean access$200(final Builder builder) {
            return builder.is_announcement;
        }
        
        public LiveThread build() {
            return new LiveThread(this, null);
        }
        
        public Builder id(final String id) {
            this.id = id;
            return this;
        }
        
        public Builder is_announcement(final Boolean is_announcement) {
            this.is_announcement = is_announcement;
            return this;
        }
        
        public void reset() {
            this.id = null;
            this.is_announcement = null;
        }
    }
    
    public static final class LiveThreadAdapter implements a<LiveThread, Builder>
    {
        private LiveThreadAdapter() {
        }
        
        public LiveThread read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public LiveThread read(final e e, final Builder builder) throws IOException {
            e.H();
            while (true) {
                final kt.b q = e.q();
                final byte a = q.a;
                if (a == 0) {
                    break;
                }
                final short b = q.b;
                if (b != 1) {
                    if (b != 2) {
                        mt.a.a(e, a);
                    }
                    else if (a == 2) {
                        builder.is_announcement(e.b());
                    }
                    else {
                        mt.a.a(e, a);
                    }
                }
                else if (a == 11) {
                    builder.id(e.F());
                }
                else {
                    mt.a.a(e, a);
                }
                e.r();
            }
            e.J();
            return builder.build();
        }
        
        public void write(final e e, final LiveThread liveThread) throws IOException {
            e.a0();
            if (liveThread.id != null) {
                e.N(1, (byte)11);
                e.Z(liveThread.id);
                e.O();
            }
            if (liveThread.is_announcement != null) {
                e.N(2, (byte)2);
                d.z(liveThread.is_announcement, e);
            }
            e.P();
            e.b0();
        }
    }
}
