package com.ram.ds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class GraphCycles {

    public static void main(String[] args) {

    }

    public static class Graph {

        private Map<Vertex, List<Vertex>> adjacentlyList;
        private Set<Vertex> vertices;

        public Graph() {
            this.adjacentlyList = new HashMap<>();
            this.vertices = new HashSet<>();
        }

        public Set<Vertex> getVertices() {
            return vertices;
        }

        public void addVertex(Vertex vertex) {
            if (adjacentlyList.containsKey(vertex)) {

            } else {
                this.adjacentlyList.put(vertex, new ArrayList<>());
            }
        }
        public void addEdge(Vertex source, Vertex destination) {
            if(this.adjacentlyList.containsKey(source)){
                this.adjacentlyList.get(vertices).add(destination);
            }
        }

    }

    public static class Vertex {

        int data;

        public Vertex(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Vertex vertex = (Vertex) o;
            return data == vertex.data;
        }

        @Override
        public int hashCode() {
            return Objects.hash(data);
        }
    }
}
