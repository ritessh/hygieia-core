package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTeam is a Querydsl query type for Team
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTeam extends EntityPathBase<Team> {

    private static final long serialVersionUID = 1154703679L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTeam team = new QTeam("team");

    public final QBaseModel _super;

    public final StringPath assetState = createString("assetState");

    public final StringPath changeDate = createString("changeDate");

    //inherited
    public final StringPath clientReference;

    public final QCollector collector;

    public final org.bson.types.QObjectId collectorId;

    public final BooleanPath enabled = createBoolean("enabled");

    // inherited
    public final org.bson.types.QObjectId id;

    public final StringPath isDeleted = createString("isDeleted");

    public final NumberPath<Long> lastCollected = createNumber("lastCollected", Long.class);

    public final StringPath name = createString("name");

    public final StringPath teamId = createString("teamId");

    public final StringPath teamType = createString("teamType");

    //inherited
    public final DateTimePath<java.util.Date> upsertTime;

    public QTeam(String variable) {
        this(Team.class, forVariable(variable), INITS);
    }

    public QTeam(Path<? extends Team> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QTeam(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QTeam(PathMetadata metadata, PathInits inits) {
        this(Team.class, metadata, inits);
    }

    public QTeam(Class<? extends Team> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QBaseModel(type, metadata, inits);
        this.clientReference = _super.clientReference;
        this.collector = inits.isInitialized("collector") ? new QCollector(forProperty("collector"), inits.get("collector")) : null;
        this.collectorId = inits.isInitialized("collectorId") ? new org.bson.types.QObjectId(forProperty("collectorId")) : null;
        this.id = _super.id;
        this.upsertTime = _super.upsertTime;
    }

}

