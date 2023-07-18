#User function Template for python3

'''
class Node:
    def __init__(self,val):
        self.data = val
        self.left = None
        self.right = None
'''

from collections import defaultdict
class Pair : 
    
    def __init__(self,node,level):
        self.node = node
        self.level = level
        
def reverseLevelOrder(root):
    # code here
    q = []
    res = []
    d = defaultdict(list)
    
    if not root : return res
    
    q.append(Pair(node = root,level = 0))
    
    while(len(q) > 0):
        
        current = q.pop(0)
        d[current.level].append(current.node.data)
        if current.node.left : q.append(Pair(node = current.node.left, level = current.level + 1))
        if current.node.right : q.append(Pair(node = current.node.right,level = current.level + 1))
    
    d = sorted(d.items(), key = lambda x : x[0], reverse = True)
    
    for pair in d:
        for i in pair[1]:
            res.append(i)
    
    
    return res
        
            

#{ 
 # Driver Code Starts
#Initial Template for Python 3

from collections import deque
# Tree Node
class Node:
    def __init__(self, val):
        self.right = None
        self.data = val
        self.left = None

# Function to Build Tree   
def buildTree(s):
    #Corner Case
    if(len(s)==0 or s[0]=="N"):           
        return None
        
    # Creating list of strings from input 
    # string after spliting by space
    ip=list(map(str,s.split()))
    
    # Create the root of the tree
    root=Node(int(ip[0]))                     
    size=0
    q=deque()
    
    # Push the root to the queue
    q.append(root)                            
    size=size+1 
    
    # Starting from the second element
    i=1                                       
    while(size>0 and i<len(ip)):
        # Get and remove the front of the queue
        currNode=q[0]
        q.popleft()
        size=size-1
        
        # Get the current node's value from the string
        currVal=ip[i]
        
        # If the left child is not null
        if(currVal!="N"):
            
            # Create the left child for the current node
            currNode.left=Node(int(currVal))
            
            # Push it to the queue
            q.append(currNode.left)
            size=size+1
        # For the right child
        i=i+1
        if(i>=len(ip)):
            break
        currVal=ip[i]
        
        # If the right child is not null
        if(currVal!="N"):
            
            # Create the right child for the current node
            currNode.right=Node(int(currVal))
            
            # Push it to the queue
            q.append(currNode.right)
            size=size+1
        i=i+1
    return root
    
    
if __name__=="__main__":
    t=int(input())
    for _ in range(0,t):
        s=input()
        root=buildTree(s)
        ans = reverseLevelOrder(root)
        for i in ans:
            print(i,end=" ")
        print()

# } Driver Code Ends