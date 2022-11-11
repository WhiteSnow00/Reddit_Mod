// 
// Decompiled by Procyon v0.6.0
// 

package ie;

public final class q8 implements p8
{
    public static final t4 A;
    public static final t4 B;
    public static final t4 C;
    public static final t4 D;
    public static final t4 E;
    public static final t4 F;
    public static final t4 G;
    public static final t4 H;
    public static final w4 I;
    public static final t4 J;
    public static final t4 a;
    public static final t4 b;
    public static final t4 c;
    public static final w4 d;
    public static final w4 e;
    public static final t4 f;
    public static final t4 g;
    public static final t4 h;
    public static final t4 i;
    public static final t4 j;
    public static final t4 k;
    public static final t4 l;
    public static final t4 m;
    public static final t4 n;
    public static final t4 o;
    public static final t4 p;
    public static final t4 q;
    public static final t4 r;
    public static final t4 s;
    public static final t4 t;
    public static final t4 u;
    public static final t4 v;
    public static final t4 w;
    public static final t4 x;
    public static final t4 y;
    public static final t4 z;
    
    static {
        final x4 a2 = new x4(r4.a(), false, false).a();
        a = a2.c(10000L, "measurement.ad_id_cache_time");
        b = a2.c(100L, "measurement.max_bundles_per_iteration");
        c = a2.c(86400000L, "measurement.config.cache_time");
        a2.d("measurement.log_tag", "FA");
        d = new w4(a2, "measurement.config.url_authority", "app-measurement.com");
        e = new w4(a2, "measurement.config.url_scheme", "https");
        f = a2.c(1000L, "measurement.upload.debug_upload_interval");
        g = a2.c(4L, "measurement.lifetimevalue.max_currency_tracked");
        h = a2.c(100000L, "measurement.store.max_stored_events_per_app");
        i = a2.c(50L, "measurement.experiment.max_ids");
        j = a2.c(200L, "measurement.audience.filter_result_max_count");
        k = a2.c(60000L, "measurement.alarm_manager.minimum_interval");
        l = a2.c(500L, "measurement.upload.minimum_delay");
        m = a2.c(86400000L, "measurement.monitoring.sample_period_millis");
        n = a2.c(10000L, "measurement.upload.realtime_upload_interval");
        o = a2.c(604800000L, "measurement.upload.refresh_blacklisted_config_interval");
        a2.c(3600000L, "measurement.config.cache_time.service");
        p = a2.c(5000L, "measurement.service_client.idle_disconnect_millis");
        a2.d("measurement.log_tag.service", "FA-SVC");
        q = a2.c(86400000L, "measurement.upload.stale_data_deletion_interval");
        r = a2.c(604800000L, "measurement.sdk.attribution.cache.ttl");
        s = a2.c(7200000L, "measurement.redaction.app_instance_id.ttl");
        t = a2.c(43200000L, "measurement.upload.backoff_period");
        u = a2.c(15000L, "measurement.upload.initial_upload_delay_time");
        v = a2.c(3600000L, "measurement.upload.interval");
        w = a2.c(65536L, "measurement.upload.max_bundle_size");
        x = a2.c(100L, "measurement.upload.max_bundles");
        y = a2.c(500L, "measurement.upload.max_conversions_per_day");
        z = a2.c(1000L, "measurement.upload.max_error_events_per_day");
        A = a2.c(1000L, "measurement.upload.max_events_per_bundle");
        B = a2.c(100000L, "measurement.upload.max_events_per_day");
        C = a2.c(50000L, "measurement.upload.max_public_events_per_day");
        D = a2.c(2419200000L, "measurement.upload.max_queue_time");
        E = a2.c(10L, "measurement.upload.max_realtime_events_per_day");
        F = a2.c(65536L, "measurement.upload.max_batch_size");
        G = a2.c(6L, "measurement.upload.retry_count");
        H = a2.c(1800000L, "measurement.upload.retry_time");
        I = new w4(a2, "measurement.upload.url", "https://app-measurement.com/a");
        J = a2.c(3600000L, "measurement.upload.window_interval");
    }
    
    public final long A() {
        return (long)q8.s.b();
    }
    
    public final long B() {
        return (long)q8.w.b();
    }
    
    public final long C() {
        return (long)q8.x.b();
    }
    
    public final long D() {
        return (long)q8.v.b();
    }
    
    public final long E() {
        return (long)q8.A.b();
    }
    
    public final long F() {
        return (long)q8.B.b();
    }
    
    public final long G() {
        return (long)q8.y.b();
    }
    
    public final long H() {
        return (long)q8.z.b();
    }
    
    public final long I() {
        return (long)q8.E.b();
    }
    
    public final long a() {
        return (long)q8.f.b();
    }
    
    public final long b() {
        return (long)q8.h.b();
    }
    
    public final long c() {
        return (long)q8.k.b();
    }
    
    public final long d() {
        return (long)q8.i.b();
    }
    
    public final long e() {
        return (long)q8.n.b();
    }
    
    public final long f() {
        return (long)q8.l.b();
    }
    
    public final long g() {
        return (long)q8.m.b();
    }
    
    public final long h() {
        return (long)q8.q.b();
    }
    
    public final long i() {
        return (long)q8.o.b();
    }
    
    public final String j() {
        return (String)q8.d.b();
    }
    
    public final long k() {
        return (long)q8.t.b();
    }
    
    public final long l() {
        return (long)q8.p.b();
    }
    
    public final long m() {
        return (long)q8.u.b();
    }
    
    public final long n() {
        return (long)q8.D.b();
    }
    
    public final long o() {
        return (long)q8.C.b();
    }
    
    public final long p() {
        return (long)q8.H.b();
    }
    
    public final long q() {
        return (long)q8.J.b();
    }
    
    public final long r() {
        return (long)q8.b.b();
    }
    
    public final long s() {
        return (long)q8.c.b();
    }
    
    public final long t() {
        return (long)q8.g.b();
    }
    
    public final long u() {
        return (long)q8.j.b();
    }
    
    public final long v() {
        return (long)q8.F.b();
    }
    
    public final long w() {
        return (long)q8.G.b();
    }
    
    public final String x() {
        return (String)q8.I.b();
    }
    
    public final String y() {
        return (String)q8.e.b();
    }
    
    public final long z() {
        return (long)q8.r.b();
    }
    
    public final long zza() {
        return (long)q8.a.b();
    }
}
