.PHONY: degraph

degraph:
	@mvn com.github.ferstl:depgraph-maven-plugin:aggregate \
		-DcreateImage=true \
		-DreduceEdges=false \
		-Dscope=compile \
		"-Dincludes=com.food.ordering.system*:*"
