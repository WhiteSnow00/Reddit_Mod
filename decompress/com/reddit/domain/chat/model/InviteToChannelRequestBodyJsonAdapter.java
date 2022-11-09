// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import com.squareup.moshi.x;
import qd2.a;
import com.squareup.moshi.JsonReader;
import java.util.Set;
import kotlin.collections.EmptySet;
import com.squareup.moshi.a0;
import java.lang.reflect.Type;
import ah2.f;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014�\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004�\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00018\u0002X\u0082\u0004�\u0006\u0006\n\u0004\b\u0012\u0010\u0013�\u0006\u0018" }, d2 = { "Lcom/reddit/domain/chat/model/InviteToChannelRequestBodyJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/chat/model/InviteToChannelRequestBody;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lpg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "Lcom/reddit/domain/chat/model/User;", "listOfUserAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class InviteToChannelRequestBodyJsonAdapter extends JsonAdapter<InviteToChannelRequestBody>
{
    private final JsonAdapter<List<User>> listOfUserAdapter;
    private final JsonReader$b options;
    
    public InviteToChannelRequestBodyJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "users" });
        this.listOfUserAdapter = (JsonAdapter<List<User>>)y.c((Type)a0.d((Class)List.class, new Type[] { User.class }), (Set)EmptySet.INSTANCE, "users");
    }
    
    public InviteToChannelRequestBody fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        List list = null;
        while (jsonReader.hasNext()) {
            final int f = jsonReader.F(this.options);
            if (f != -1) {
                if (f != 0) {
                    continue;
                }
                list = (List)this.listOfUserAdapter.fromJson(jsonReader);
                if (list != null) {
                    continue;
                }
                throw a.n("users", "users", jsonReader);
            }
            else {
                jsonReader.J();
                jsonReader.z1();
            }
        }
        jsonReader.r();
        if (list != null) {
            return new InviteToChannelRequestBody(list);
        }
        throw a.h("users", "users", jsonReader);
    }
    
    public void toJson(final x x, final InviteToChannelRequestBody inviteToChannelRequestBody) {
        f.f((Object)x, "writer");
        if (inviteToChannelRequestBody != null) {
            x.h();
            x.w("users");
            this.listOfUserAdapter.toJson(x, (Object)inviteToChannelRequestBody.getUsers());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(InviteToChannelRequestBody)";
    }
}