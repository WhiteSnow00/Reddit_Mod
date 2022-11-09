// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.util.Iterator;
import com.microsoft.thrifty.ThriftException;
import kt.c;
import java.util.ArrayList;
import jt.b;
import java.io.IOException;
import kt.e;
import ak0.n;
import java.util.Collections;
import java.util.List;
import jt.a;

public final class LiveAudioRoom
{
    public static final a<LiveAudioRoom, Builder> ADAPTER;
    public final String creator_id;
    public final String id;
    public final String platform;
    public final String title;
    public final List<String> topic_ids;
    
    static {
        ADAPTER = (a)new LiveAudioRoomAdapter(null);
    }
    
    private LiveAudioRoom(final Builder builder) {
        this.id = Builder.access$100(builder);
        this.title = Builder.access$200(builder);
        this.platform = Builder.access$300(builder);
        this.creator_id = Builder.access$400(builder);
        List<String> unmodifiableList;
        if (Builder.access$500(builder) == null) {
            unmodifiableList = null;
        }
        else {
            unmodifiableList = Collections.unmodifiableList((List<? extends String>)Builder.access$500(builder));
        }
        this.topic_ids = unmodifiableList;
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
        if (!(o instanceof LiveAudioRoom)) {
            return false;
        }
        final LiveAudioRoom liveAudioRoom = (LiveAudioRoom)o;
        final String id = this.id;
        final String id2 = liveAudioRoom.id;
        if (id == id2 || (id != null && id.equals(id2))) {
            final String title = this.title;
            final String title2 = liveAudioRoom.title;
            if (title == title2 || (title != null && title.equals(title2))) {
                final String platform = this.platform;
                final String platform2 = liveAudioRoom.platform;
                if (platform == platform2 || (platform != null && platform.equals(platform2))) {
                    final String creator_id = this.creator_id;
                    final String creator_id2 = liveAudioRoom.creator_id;
                    if (creator_id == creator_id2 || (creator_id != null && creator_id.equals(creator_id2))) {
                        final List<String> topic_ids = this.topic_ids;
                        final List<String> topic_ids2 = liveAudioRoom.topic_ids;
                        boolean b2 = b;
                        if (topic_ids == topic_ids2) {
                            return b2;
                        }
                        if (topic_ids != null && topic_ids.equals(topic_ids2)) {
                            b2 = b;
                            return b2;
                        }
                    }
                }
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
        final String title = this.title;
        int hashCode3;
        if (title == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = title.hashCode();
        }
        final String platform = this.platform;
        int hashCode4;
        if (platform == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = platform.hashCode();
        }
        final String creator_id = this.creator_id;
        int hashCode5;
        if (creator_id == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = creator_id.hashCode();
        }
        final List<String> topic_ids = this.topic_ids;
        if (topic_ids != null) {
            hashCode = topic_ids.hashCode();
        }
        return (((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("LiveAudioRoom{id=");
        k.append(this.id);
        k.append(", title=");
        k.append(this.title);
        k.append(", platform=");
        k.append(this.platform);
        k.append(", creator_id=");
        k.append(this.creator_id);
        k.append(", topic_ids=");
        return n.r(k, (List)this.topic_ids, "}");
    }
    
    public void write(final e e) throws IOException {
        LiveAudioRoom.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<LiveAudioRoom>
    {
        private String creator_id;
        private String id;
        private String platform;
        private String title;
        private List<String> topic_ids;
        
        public Builder() {
        }
        
        public Builder(final LiveAudioRoom liveAudioRoom) {
            this.id = liveAudioRoom.id;
            this.title = liveAudioRoom.title;
            this.platform = liveAudioRoom.platform;
            this.creator_id = liveAudioRoom.creator_id;
            this.topic_ids = liveAudioRoom.topic_ids;
        }
        
        public static /* synthetic */ String access$100(final Builder builder) {
            return builder.id;
        }
        
        public static /* synthetic */ String access$200(final Builder builder) {
            return builder.title;
        }
        
        public static /* synthetic */ String access$300(final Builder builder) {
            return builder.platform;
        }
        
        public static /* synthetic */ String access$400(final Builder builder) {
            return builder.creator_id;
        }
        
        public static /* synthetic */ List access$500(final Builder builder) {
            return builder.topic_ids;
        }
        
        public LiveAudioRoom build() {
            return new LiveAudioRoom(this, null);
        }
        
        public Builder creator_id(final String creator_id) {
            this.creator_id = creator_id;
            return this;
        }
        
        public Builder id(final String id) {
            this.id = id;
            return this;
        }
        
        public Builder platform(final String platform) {
            this.platform = platform;
            return this;
        }
        
        public void reset() {
            this.id = null;
            this.title = null;
            this.platform = null;
            this.creator_id = null;
            this.topic_ids = null;
        }
        
        public Builder title(final String title) {
            this.title = title;
            return this;
        }
        
        public Builder topic_ids(final List<String> topic_ids) {
            this.topic_ids = topic_ids;
            return this;
        }
    }
    
    public static final class LiveAudioRoomAdapter implements a<LiveAudioRoom, Builder>
    {
        private LiveAudioRoomAdapter() {
        }
        
        public LiveAudioRoom read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public LiveAudioRoom read(final e e, final Builder builder) throws IOException {
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
                        if (b != 3) {
                            if (b != 4) {
                                if (b != 5) {
                                    mt.a.a(e, a);
                                }
                                else if (a == 15) {
                                    final c w = e.w();
                                    final ArrayList list = new ArrayList(w.b);
                                    for (int i = 0; i < w.b; i = d.h(e, list, i, 1)) {}
                                    e.x();
                                    builder.topic_ids((List<String>)list);
                                }
                                else {
                                    mt.a.a(e, a);
                                }
                            }
                            else if (a == 11) {
                                builder.creator_id(e.F());
                            }
                            else {
                                mt.a.a(e, a);
                            }
                        }
                        else if (a == 11) {
                            builder.platform(e.F());
                        }
                        else {
                            mt.a.a(e, a);
                        }
                    }
                    else if (a == 11) {
                        builder.title(e.F());
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
        
        public void write(final e e, final LiveAudioRoom liveAudioRoom) throws IOException {
            e.a0();
            if (liveAudioRoom.id != null) {
                e.N(1, (byte)11);
                e.Z(liveAudioRoom.id);
                e.O();
            }
            if (liveAudioRoom.title != null) {
                e.N(2, (byte)11);
                e.Z(liveAudioRoom.title);
                e.O();
            }
            if (liveAudioRoom.platform != null) {
                e.N(3, (byte)11);
                e.Z(liveAudioRoom.platform);
                e.O();
            }
            if (liveAudioRoom.creator_id != null) {
                e.N(4, (byte)11);
                e.Z(liveAudioRoom.creator_id);
                e.O();
            }
            if (liveAudioRoom.topic_ids != null) {
                e.N(5, (byte)15);
                e.V((byte)11, liveAudioRoom.topic_ids.size());
                final Iterator<String> iterator = liveAudioRoom.topic_ids.iterator();
                while (iterator.hasNext()) {
                    e.Z((String)iterator.next());
                }
                e.X();
                e.O();
            }
            e.P();
            e.b0();
        }
    }
}
