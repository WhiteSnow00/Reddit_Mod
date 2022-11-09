// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.postsubmit.remote;

import av2.o;
import av2.l;
import wu2.b;
import av2.q;
import okhttp3.MultipartBody$Part;
import av2.r;
import java.util.Map;
import av2.y;

public interface AwsService
{
    @l
    @o
    b<String> uploadFile(@y final String p0, @r final Map<String, String> p1, @q final MultipartBody$Part p2);
}
