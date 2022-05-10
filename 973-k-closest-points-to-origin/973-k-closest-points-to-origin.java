class Solution {
    
    class Point implements Comparable<Point> {
        
        int[]coordinates = new int[2];
        int distance;
        
        Point(int[] coordinates, int distance){
            this.coordinates = coordinates;
            this.distance = distance;
        }
        
        public int compareTo(Point p){
            return p.distance - this.distance;
        }
        
    }
    public int[][] kClosest(int[][] points, int k) {
        
        int[][] result = new int[k][2];
        if(points.length == 0 || k > points.length) return result;
        
        PriorityQueue<Point> pq = new PriorityQueue<>();
        
        for(int i = 0;i<k;i++){
            
            int[] currentCoordinates = new int[2];
            currentCoordinates[0] = points[i][0];
            currentCoordinates[1] = points[i][1];
            int currentDistance = distance(points[i][0],points[i][1]);
            
            pq.add(new Point(currentCoordinates, currentDistance));
        }
        
        for(int i = k;i<points.length;i++){
            
            int[] currentCoordinates = new int[2];
            currentCoordinates[0] = points[i][0];
            currentCoordinates[1] = points[i][1];
            int currentDistance = distance(points[i][0],points[i][1]);
            
            int distanceFromQueue = pq.peek().distance;
            
            if(currentDistance < distanceFromQueue){
                pq.poll();
                pq.add(new Point(currentCoordinates, currentDistance));
            }
            
    
        }
        
        int index = 0;
        while(!pq.isEmpty()){
            int[] coordinates = pq.poll().coordinates;
            result[index][0] = coordinates[0];
            result[index][1] = coordinates[1];
            index++;
        }
        
        return result;
        
    }
    
    public int distance(int x, int y){
        int squaredDistance = (int) (Math.pow(x,2) + Math.pow(y,2));
        return (int) squaredDistance;
    }
}