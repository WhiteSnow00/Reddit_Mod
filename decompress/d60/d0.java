// 
// Decompiled by Procyon v0.6.0
// 

package d60;

import com.reddit.data.model.v1.MessageListing;
import com.reddit.domain.model.DiscussionType;
import com.reddit.domain.model.FileUploadResponse;
import java.util.List;
import java.io.InputStream;
import com.reddit.domain.model.FileUploadLease;
import com.reddit.domain.model.FileUploadLeaseMediaGallery;
import nf2.c0;

public interface d0
{
    c0<FileUploadLeaseMediaGallery> a(final String p0, final String p1);
    
    c0<FileUploadLease> b(final String p0, final String p1);
    
    FileUploadResponse c(final String p0, final InputStream p1, final String p2, final List<FileUploadLease.Field> p3);
    
    c0<FileUploadLease> d(final String p0, final String p1);
    
    c0 e(final String p0, final String p1, final String p2, final String p3, final String p4, final String p5, final DiscussionType p6, final boolean p7, final boolean p8);
    
    c0<MessageListing> f(final String p0);
    
    c0 g(final int p0, final String p1, final String p2);
}
