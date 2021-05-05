package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEnvironmentStatus is a Querydsl query type for EnvironmentStatus
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEnvironmentStatus extends EntityPathBase<EnvironmentStatus> {

    private static final long serialVersionUID = 1290564675L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QEnvironmentStatus environmentStatus = new QEnvironmentStatus("environmentStatus");

    public final QBaseModel _super;

    //inherited
    public final StringPath clientReference;

    public final org.bson.types.QObjectId collectorItemId;

    public final StringPath componentID = createString("componentID");

    public final StringPath componentName = createString("componentName");

    public final StringPath environmentName = createString("environmentName");

    // inherited
    public final org.bson.types.QObjectId id;

    public final BooleanPath online = createBoolean("online");

    public final StringPath parentAgentName = createString("parentAgentName");

    public final StringPath resourceName = createString("resourceName");

    //inherited
    public final DateTimePath<java.util.Date> upsertTime;

    public QEnvironmentStatus(String variable) {
        this(EnvironmentStatus.class, forVariable(variable), INITS);
    }

    public QEnvironmentStatus(Path<? extends EnvironmentStatus> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QEnvironmentStatus(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QEnvironmentStatus(PathMetadata metadata, PathInits inits) {
        this(EnvironmentStatus.class, metadata, inits);
    }

    public QEnvironmentStatus(Class<? extends EnvironmentStatus> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QBaseModel(type, metadata, inits);
        this.clientReference = _super.clientReference;
        this.collectorItemId = inits.isInitialized("collectorItemId") ? new org.bson.types.QObjectId(forProperty("collectorItemId")) : null;
        this.id = _super.id;
        this.upsertTime = _super.upsertTime;
    }

}

