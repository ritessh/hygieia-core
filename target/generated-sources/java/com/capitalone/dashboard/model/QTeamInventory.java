package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTeamInventory is a Querydsl query type for TeamInventory
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTeamInventory extends EntityPathBase<TeamInventory> {

    private static final long serialVersionUID = 1769918173L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTeamInventory teamInventory = new QTeamInventory("teamInventory");

    public final QBaseModel _super;

    //inherited
    public final StringPath clientReference;

    public final QCollector collector;

    public final org.bson.types.QObjectId collectorId;

    public final org.bson.types.QObjectId collectorItemId;

    // inherited
    public final org.bson.types.QObjectId id;

    public final StringPath lob = createString("lob");

    public final StringPath name = createString("name");

    public final StringPath teamId = createString("teamId");

    public final ListPath<TeamMember, QTeamMember> teamMembers = this.<TeamMember, QTeamMember>createList("teamMembers", TeamMember.class, QTeamMember.class, PathInits.DIRECT2);

    public final NumberPath<Long> timestamp = createNumber("timestamp", Long.class);

    //inherited
    public final DateTimePath<java.util.Date> upsertTime;

    public QTeamInventory(String variable) {
        this(TeamInventory.class, forVariable(variable), INITS);
    }

    public QTeamInventory(Path<? extends TeamInventory> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QTeamInventory(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QTeamInventory(PathMetadata metadata, PathInits inits) {
        this(TeamInventory.class, metadata, inits);
    }

    public QTeamInventory(Class<? extends TeamInventory> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QBaseModel(type, metadata, inits);
        this.clientReference = _super.clientReference;
        this.collector = inits.isInitialized("collector") ? new QCollector(forProperty("collector"), inits.get("collector")) : null;
        this.collectorId = inits.isInitialized("collectorId") ? new org.bson.types.QObjectId(forProperty("collectorId")) : null;
        this.collectorItemId = inits.isInitialized("collectorItemId") ? new org.bson.types.QObjectId(forProperty("collectorItemId")) : null;
        this.id = _super.id;
        this.upsertTime = _super.upsertTime;
    }

}

