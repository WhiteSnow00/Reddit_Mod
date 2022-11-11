// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import ft.e;
import et.a;

public final class UserFlair
{
    public static final a<UserFlair, UserFlair.UserFlair$Builder> ADAPTER;
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
        ADAPTER = (a)new UserFlair.UserFlair$UserFlairAdapter((UserFlair$1)null);
    }
    
    private UserFlair(final UserFlair.UserFlair$Builder userFlair$Builder) {
        this.id = UserFlair.UserFlair$Builder.access$100(userFlair$Builder);
        this.title = UserFlair.UserFlair$Builder.access$200(userFlair$Builder);
        this.active = UserFlair.UserFlair$Builder.access$300(userFlair$Builder);
        this.id_achieve = UserFlair.UserFlair$Builder.access$400(userFlair$Builder);
        this.title_achieve = UserFlair.UserFlair$Builder.access$500(userFlair$Builder);
        this.locked = UserFlair.UserFlair$Builder.access$600(userFlair$Builder);
        this.id_supporter = UserFlair.UserFlair$Builder.access$700(userFlair$Builder);
        this.title_supporter = UserFlair.UserFlair$Builder.access$800(userFlair$Builder);
        this.is_supporter = UserFlair.UserFlair$Builder.access$900(userFlair$Builder);
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
        final StringBuilder r = a.r("UserFlair{id=");
        r.append(this.id);
        r.append(", title=");
        r.append(this.title);
        r.append(", active=");
        r.append(this.active);
        r.append(", id_achieve=");
        r.append(this.id_achieve);
        r.append(", title_achieve=");
        r.append(this.title_achieve);
        r.append(", locked=");
        r.append(this.locked);
        r.append(", id_supporter=");
        r.append(this.id_supporter);
        r.append(", title_supporter=");
        r.append(this.title_supporter);
        r.append(", is_supporter=");
        r.append(this.is_supporter);
        r.append("}");
        return r.toString();
    }
    
    public void write(final e e) throws IOException {
        UserFlair.ADAPTER.write(e, (Object)this);
    }
}
