package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCodeQualityMetric is a Querydsl query type for CodeQualityMetric
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QCodeQualityMetric extends BeanPath<CodeQualityMetric> {

    private static final long serialVersionUID = 1567986432L;

    public static final QCodeQualityMetric codeQualityMetric = new QCodeQualityMetric("codeQualityMetric");

    public final StringPath formattedValue = createString("formattedValue");

    public final ListPath<Instance, SimplePath<Instance>> instances = this.<Instance, SimplePath<Instance>>createList("instances", Instance.class, SimplePath.class, PathInits.DIRECT2);

    public final StringPath name = createString("name");

    public final EnumPath<CodeQualityMetricStatus> status = createEnum("status", CodeQualityMetricStatus.class);

    public final StringPath statusMessage = createString("statusMessage");

    public final StringPath value = createString("value");

    public QCodeQualityMetric(String variable) {
        super(CodeQualityMetric.class, forVariable(variable));
    }

    public QCodeQualityMetric(Path<? extends CodeQualityMetric> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCodeQualityMetric(PathMetadata metadata) {
        super(CodeQualityMetric.class, metadata);
    }

}

