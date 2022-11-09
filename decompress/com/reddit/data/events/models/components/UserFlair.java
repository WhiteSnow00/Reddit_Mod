// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import jt.b;
import java.io.IOException;
import kt.e;
import jt.a;

public final class UserFlair
{
    public static final a<UserFlair, Builder> ADAPTER;
    public final Boolean active;
    public final String id;
    public final String id_achieve;
    public final String id_supporter;
    public final Boolean is_supporter;
    public final Boolean locked;
    public final String title;
    public final String title_achieve;
    public final String title_supporter;
    
    static {
        ADAPTER = (a)new UserFlairAdapter(null);
    }
    
    private UserFlair(final Builder builder) {
        this.id = Builder.access$100(builder);
        this.title = Builder.access$200(builder);
        this.active = Builder.access$300(builder);
        this.id_achieve = Builder.access$400(builder);
        this.title_achieve = Builder.access$500(builder);
        this.locked = Builder.access$600(builder);
        this.id_supporter = Builder.access$700(builder);
        this.title_supporter = Builder.access$800(builder);
        this.is_supporter = Builder.access$900(builder);
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
        if (!(o instanceof UserFlair)) {
            return false;
        }
        final UserFlair userFlair = (UserFlair)o;
        final String id = this.id;
        final String id2 = userFlair.id;
        if (id == id2 || (id != null && id.equals(id2))) {
            final String title = this.title;
            final String title2 = userFlair.title;
            if (title == title2 || (title != null && title.equals(title2))) {
                final Boolean active = this.active;
                final Boolean active2 = userFlair.active;
                if (active == active2 || (active != null && active.equals(active2))) {
                    final String id_achieve = this.id_achieve;
                    final String id_achieve2 = userFlair.id_achieve;
                    if (id_achieve == id_achieve2 || (id_achieve != null && id_achieve.equals(id_achieve2))) {
                        final String title_achieve = this.title_achieve;
                        final String title_achieve2 = userFlair.title_achieve;
                        if (title_achieve == title_achieve2 || (title_achieve != null && title_achieve.equals(title_achieve2))) {
                            final Boolean locked = this.locked;
                            final Boolean locked2 = userFlair.locked;
                            if (locked == locked2 || (locked != null && locked.equals(locked2))) {
                                final String id_supporter = this.id_supporter;
                                final String id_supporter2 = userFlair.id_supporter;
                                if (id_supporter == id_supporter2 || (id_supporter != null && id_supporter.equals(id_supporter2))) {
                                    final String title_supporter = this.title_supporter;
                                    final String title_supporter2 = userFlair.title_supporter;
                                    if (title_supporter == title_supporter2 || (title_supporter != null && title_supporter.equals(title_supporter2))) {
                                        final Boolean is_supporter = this.is_supporter;
                                        final Boolean is_supporter2 = userFlair.is_supporter;
                                        boolean b2 = b;
                                        if (is_supporter == is_supporter2) {
                                            return b2;
                                        }
                                        if (is_supporter != null && is_supporter.equals(is_supporter2)) {
                                            b2 = b;
                                            return b2;
                                        }
                                    }
                                }
                            }
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
        final Boolean active = this.active;
        int hashCode4;
        if (active == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = active.hashCode();
        }
        final String id_achieve = this.id_achieve;
        int hashCode5;
        if (id_achieve == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = id_achieve.hashCode();
        }
        final String title_achieve = this.title_achieve;
        int hashCode6;
        if (title_achieve == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = title_achieve.hashCode();
        }
        final Boolean locked = this.locked;
        int hashCode7;
        if (locked == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = locked.hashCode();
        }
        final String id_supporter = this.id_supporter;
        int hashCode8;
        if (id_supporter == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = id_supporter.hashCode();
        }
        final String title_supporter = this.title_supporter;
        int hashCode9;
        if (title_supporter == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = title_supporter.hashCode();
        }
        final Boolean is_supporter = this.is_supporter;
        if (is_supporter != null) {
            hashCode = is_supporter.hashCode();
        }
        return (((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("UserFlair{id=");
        k.append(this.id);
        k.append(", title=");
        k.append(this.title);
        k.append(", active=");
        k.append(this.active);
        k.append(", id_achieve=");
        k.append(this.id_achieve);
        k.append(", title_achieve=");
        k.append(this.title_achieve);
        k.append(", locked=");
        k.append(this.locked);
        k.append(", id_supporter=");
        k.append(this.id_supporter);
        k.append(", title_supporter=");
        k.append(this.title_supporter);
        k.append(", is_supporter=");
        k.append(this.is_supporter);
        k.append("}");
        return k.toString();
    }
    
    public void write(final e e) throws IOException {
        UserFlair.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<UserFlair>
    {
        private Boolean active;
        private String id;
        private String id_achieve;
        private String id_supporter;
        private Boolean is_supporter;
        private Boolean locked;
        private String title;
        private String title_achieve;
        private String title_supporter;
        
        public Builder() {
        }
        
        public Builder(final UserFlair userFlair) {
            this.id = userFlair.id;
            this.title = userFlair.title;
            this.active = userFlair.active;
            this.id_achieve = userFlair.id_achieve;
            this.title_achieve = userFlair.title_achieve;
            this.locked = userFlair.locked;
            this.id_supporter = userFlair.id_supporter;
            this.title_supporter = userFlair.title_supporter;
            this.is_supporter = userFlair.is_supporter;
        }
        
        public static /* synthetic */ String access$100(final Builder builder) {
            return builder.id;
        }
        
        public static /* synthetic */ String access$200(final Builder builder) {
            return builder.title;
        }
        
        public static /* synthetic */ Boolean access$300(final Builder builder) {
            return builder.active;
        }
        
        public static /* synthetic */ String access$400(final Builder builder) {
            return builder.id_achieve;
        }
        
        public static /* synthetic */ String access$500(final Builder builder) {
            return builder.title_achieve;
        }
        
        public static /* synthetic */ Boolean access$600(final Builder builder) {
            return builder.locked;
        }
        
        public static /* synthetic */ String access$700(final Builder builder) {
            return builder.id_supporter;
        }
        
        public static /* synthetic */ String access$800(final Builder builder) {
            return builder.title_supporter;
        }
        
        public static /* synthetic */ Boolean access$900(final Builder builder) {
            return builder.is_supporter;
        }
        
        public Builder active(final Boolean active) {
            this.active = active;
            return this;
        }
        
        public UserFlair build() {
            return new UserFlair(this, null);
        }
        
        public Builder id(final String id) {
            this.id = id;
            return this;
        }
        
        public Builder id_achieve(final String id_achieve) {
            this.id_achieve = id_achieve;
            return this;
        }
        
        public Builder id_supporter(final String id_supporter) {
            this.id_supporter = id_supporter;
            return this;
        }
        
        public Builder is_supporter(final Boolean is_supporter) {
            this.is_supporter = is_supporter;
            return this;
        }
        
        public Builder locked(final Boolean locked) {
            this.locked = locked;
            return this;
        }
        
        public void reset() {
            this.id = null;
            this.title = null;
            this.active = null;
            this.id_achieve = null;
            this.title_achieve = null;
            this.locked = null;
            this.id_supporter = null;
            this.title_supporter = null;
            this.is_supporter = null;
        }
        
        public Builder title(final String title) {
            this.title = title;
            return this;
        }
        
        public Builder title_achieve(final String title_achieve) {
            this.title_achieve = title_achieve;
            return this;
        }
        
        public Builder title_supporter(final String title_supporter) {
            this.title_supporter = title_supporter;
            return this;
        }
    }
    
    public static final class UserFlairAdapter implements a<UserFlair, Builder>
    {
        private UserFlairAdapter() {
        }
        
        public UserFlair read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public UserFlair read(final e e, final Builder builder) throws IOException {
            e.H();
            while (true) {
                final kt.b q = e.q();
                final byte a = q.a;
                if (a == 0) {
                    break;
                }
                switch (q.b) {
                    default: {
                        mt.a.a(e, a);
                        break;
                    }
                    case 9: {
                        if (a == 2) {
                            builder.is_supporter(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 8: {
                        if (a == 11) {
                            builder.title_supporter(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 7: {
                        if (a == 11) {
                            builder.id_supporter(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 6: {
                        if (a == 2) {
                            builder.locked(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 5: {
                        if (a == 11) {
                            builder.title_achieve(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 11) {
                            builder.id_achieve(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 3: {
                        if (a == 2) {
                            builder.active(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 2: {
                        if (a == 11) {
                            builder.title(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 1: {
                        if (a == 11) {
                            builder.id(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                }
                e.r();
            }
            e.J();
            return builder.build();
        }
        
        public void write(final e e, final UserFlair userFlair) throws IOException {
            e.a0();
            if (userFlair.id != null) {
                e.N(1, (byte)11);
                e.Z(userFlair.id);
                e.O();
            }
            if (userFlair.title != null) {
                e.N(2, (byte)11);
                e.Z(userFlair.title);
                e.O();
            }
            if (userFlair.active != null) {
                e.N(3, (byte)2);
                d.z(userFlair.active, e);
            }
            if (userFlair.id_achieve != null) {
                e.N(4, (byte)11);
                e.Z(userFlair.id_achieve);
                e.O();
            }
            if (userFlair.title_achieve != null) {
                e.N(5, (byte)11);
                e.Z(userFlair.title_achieve);
                e.O();
            }
            if (userFlair.locked != null) {
                e.N(6, (byte)2);
                d.z(userFlair.locked, e);
            }
            if (userFlair.id_supporter != null) {
                e.N(7, (byte)11);
                e.Z(userFlair.id_supporter);
                e.O();
            }
            if (userFlair.title_supporter != null) {
                e.N(8, (byte)11);
                e.Z(userFlair.title_supporter);
                e.O();
            }
            if (userFlair.is_supporter != null) {
                e.N(9, (byte)2);
                d.z(userFlair.is_supporter, e);
            }
            e.P();
            e.b0();
        }
    }
}
