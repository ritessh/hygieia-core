package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCollectorItemConfigHistory is a Querydsl query type for CollectorItemConfigHistory
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCollectorItemConfigHistory extends EntityPathBase<CollectorItemConfigHistory> {

    private static final long serialVersionUID = -255320332L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCollectorItemConfigHistory collectorItemConfigHistory = new QCollectorItemConfigHistory("collectorItemConfigHistory");

    public final QBaseModel _super;

    public final MapPath<String, Object, SimplePath<Object>> changeMap = this.<String, Object, SimplePath<Object>>createMap("changeMap", String.class, Object.class, SimplePath.class);

    //inherited
    public final StringPath clientReference;

    public final org.bson.types.QObjectId collectorItemId;

    // inherited
    public final org.bson.types.QObjectId id;

    public final EnumPath<ConfigHistOperationType> operation = createEnum("operation", ConfigHistOperationType.class);

    public final NumberPath<Long> timestamp = createNumber("timestamp", Long.class);

    //inherited
    public final DateTimePath<java.util.Date> upsertTime;

    public final StringPath userID = createString("userID");

    public final StringPath userName = createString("userName");

    public QCollectorItemConfigHistory(String variable) {
        this(CollectorItemConfigHistory.class, forVariable(variable), INITS);
    }

    public QCollectorItemConfigHistory(Path<? extends CollectorItemConfigHistory> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCollectorItemConfigHistory(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCollectorItemConfigHistory(PathMetadata metadata, PathInits inits) {
        this(CollectorItemConfigHistory.class, metadata, inits);
    }

    public QCollectorItemConfigHistory(Class<? extends CollectorItemConfigHistory> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QBaseModel(type, metadata, inits);
        this.clientReference = _super.clientReference;
        this.collectorItemId = inits.isInitialized("collectorItemId") ? new org.bson.types.QObjectId(forProperty("collectorItemId")) : null;
        this.id = _super.id;
        this.upsertTime = _super.upsertTime;
    }

}

