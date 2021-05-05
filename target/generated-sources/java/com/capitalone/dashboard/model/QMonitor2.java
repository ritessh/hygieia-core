package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMonitor2 is a Querydsl query type for Monitor2
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMonitor2 extends EntityPathBase<Monitor2> {

    private static final long serialVersionUID = 1303759866L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMonitor2 monitor2 = new QMonitor2("monitor2");

    public final QBaseModel _super;

    public final StringPath applicationName = createString("applicationName");

    //inherited
    public final StringPath clientReference;

    public final org.bson.types.QObjectId dashboardId;

    // inherited
    public final org.bson.types.QObjectId id;

    public final NumberPath<Long> lastUpdated = createNumber("lastUpdated", Long.class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> status = createNumber("status", Integer.class);

    //inherited
    public final DateTimePath<java.util.Date> upsertTime;

    public final StringPath url = createString("url");

    public QMonitor2(String variable) {
        this(Monitor2.class, forVariable(variable), INITS);
    }

    public QMonitor2(Path<? extends Monitor2> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMonitor2(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMonitor2(PathMetadata metadata, PathInits inits) {
        this(Monitor2.class, metadata, inits);
    }

    public QMonitor2(Class<? extends Monitor2> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QBaseModel(type, metadata, inits);
        this.clientReference = _super.clientReference;
        this.dashboardId = inits.isInitialized("dashboardId") ? new org.bson.types.QObjectId(forProperty("dashboardId")) : null;
        this.id = _super.id;
        this.upsertTime = _super.upsertTime;
    }

}

