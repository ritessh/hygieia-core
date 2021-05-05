package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QLogAnalysisMetric is a Querydsl query type for LogAnalysisMetric
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QLogAnalysisMetric extends BeanPath<LogAnalysisMetric> {

    private static final long serialVersionUID = -856717202L;

    public static final QLogAnalysisMetric logAnalysisMetric = new QLogAnalysisMetric("logAnalysisMetric");

    public final StringPath name = createString("name");

    public final NumberPath<Integer> value = createNumber("value", Integer.class);

    public QLogAnalysisMetric(String variable) {
        super(LogAnalysisMetric.class, forVariable(variable));
    }

    public QLogAnalysisMetric(Path<? extends LogAnalysisMetric> path) {
        super(path.getType(), path.getMetadata());
    }

    public QLogAnalysisMetric(PathMetadata metadata) {
        super(LogAnalysisMetric.class, metadata);
    }

}

