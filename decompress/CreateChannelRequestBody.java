// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import sg2.e;
import java.util.Set;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f" }, d2 = { "Lcom/reddit/domain/chat/model/CreateChannelRequestBody;", "", "name", "", "users", "", "Lcom/reddit/domain/chat/model/User;", "is_distinct", "", "(Ljava/lang/String;Ljava/util/Set;Z)V", "()Z", "getName", "()Ljava/lang/String;", "getUsers", "()Ljava/util/Set;", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class CreateChannelRequestBody
{
    private final boolean is_distinct;
    private final String name;
    private final Set<User> users;
    
    public CreateChannelRequestBody(final String name, final Set<User> users, final boolean is_distinct) {
        e.f((Object)users, "users");
        this.name = name;
        this.users = users;
        this.is_distinct = is_distinct;
    }
    
    public final String getName() {
        return this.name;
    }
    
    public final Set<User> getUsers() {
        return this.users;
    }
    
    public final boolean is_distinct() {
        return this.is_distinct;
    }
}
