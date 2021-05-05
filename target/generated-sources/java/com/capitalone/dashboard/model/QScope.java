package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QScope is a Querydsl query type for Scope
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QScope extends EntityPathBase<Scope> {

    private static final long serialVersionUID = 1435106226L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QScope scope = new QScope("scope");

    public final QBaseModel _super;

    public final StringPath assetState = createString("assetState");

    public final StringPath beginDate = createString("beginDate");

    public final StringPath changeDate = createString("changeDate");

    //inherited
    public final StringPath clientReference;

    public final QCollector collector;

    public final org.bson.types.QObjectId collectorId;

    public final StringPath endDate = createString("endDate");

    // inherited
    public final org.bson.types.QObjectId id;

    public final StringPath isDeleted = createString("isDeleted");

    public final NumberPath<Long> lastCollected = createNumber("lastCollected", Long.class);

    public final StringPath name = createString("name");

    public final StringPath pId = createString("pId");

    public final StringPath projectPath = createString("projectPath");

    //inherited
    public final DateTimePath<java.util.Date> upsertTime;

    public QScope(String variable) {
        this(Scope.class, forVariable(variable), INITS);
    }

    public QScope(Path<? extends Scope> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QScope(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QScope(PathMetadata metadata, PathInits inits) {
        this(Scope.class, metadata, inits);
    }

    public QScope(Class<? extends Scope> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QBaseModel(type, metadata, inits);
        this.clientReference = _super.clientReference;
        this.collector = inits.isInitialized("collector") ? new QCollector(forProperty("collector"), inits.get("collector")) : null;
        this.collectorId = inits.isInitialized("collectorId") ? new org.bson.types.QObjectId(forProperty("collectorId")) : null;
        this.id = _super.id;
        this.upsertTime = _super.upsertTime;
    }

}

